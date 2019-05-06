public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int paperCount() {
        return this.paper;
    }

    public int tonerCount() {
        return this.toner;
    }

    public int useToner(int paper) {
        return this.toner -= paper;
    }

    public int print(int pages, int copies) {
        int paper = pages * copies;
        if (this.paper < paper) {
            return this.paper -= 0;
        } else {
            this.useToner(paper);
            return this.paper -= paper;
        }
    }

    public int refill() {
        int usedPaper = 100 - this.paperCount();
        return this.paper += usedPaper;
    }
}
