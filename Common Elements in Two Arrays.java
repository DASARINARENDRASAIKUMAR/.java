
import java.util.HashSet;
public class CommonElements {
public static void main(String[] args) {
int[] a = {1, 2, 3, 4}, b = {3, 4, 5, 6};
HashSet<Integer> set = new HashSet<>();
for (int i : a) set.add(i);
for (int j : b) {
if (set.contains(j)) {
System.out.println(j);
