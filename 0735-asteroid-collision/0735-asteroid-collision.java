import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> stack = new ArrayList<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            if (asteroid > 0) {
                stack.add(asteroid);
            } else {
                while (!stack.isEmpty() && stack.get(stack.size() - 1) > 0 && stack.get(stack.size() - 1) < Math.abs(asteroid)) {
                    stack.remove(stack.size() - 1);
                }

                if (!stack.isEmpty() && stack.get(stack.size() - 1) == Math.abs(asteroid)) {
                    stack.remove(stack.size() - 1); // both explode
                    destroyed = true;
                } else if (stack.isEmpty() || stack.get(stack.size() - 1) < 0) {
                    stack.add(asteroid); // asteroid survives
                }
            }
        }

        // Convert List to array
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }
}
