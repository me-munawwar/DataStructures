package SachinSir.bst;

import java.util.ArrayList;
import java.util.Arrays;

import SachinSir.bst.Node;

public class FileBST {
    static Node root;
    static ArrayList<String> al = new ArrayList<>();

    public static void main(String[] args) {
        String[] fileNames = new String[] {
                "document123.txt",
                "project_A_report.doc",
                "image456.jpg",
                "codefile1.py",
                "presentation_final.pptx",
                "spreadsheet_xyz.xlsx",
                "notes_file.txt",
                "design_drafts.psd",
                "audio_track.mp3",
                "meeting_minutes.docx",
                "budget_sheet.xls",
                "video_clip.mp4",
                "research_data.csv",
                "task_list.txt",
                "drawing_sketch_v2.png" };

        // Explicitly initialize the root before insertion
        // root = new Node(fileNames[0]);

        for (int i = 0; i < fileNames.length; i++) {
            root = insertToBST(fileNames[i], root);
        }

        inOrder(root);
        System.out.println("Sorted Files : " + al.toString());

    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        al.add(root.fileName);
        inOrder(root.right);

    }

    private static Node insertToBST(String fileName, Node root) {
        if (root == null) {
            return new Node(fileName);
        }

        if (fileName.compareTo(root.fileName) > 0) {
            root.right = insertToBST(fileName, root.right);
        } else if (fileName.compareTo(root.fileName) < 0) {
            root.left = insertToBST(fileName, root.left);
        }

        return root;

    }
}
