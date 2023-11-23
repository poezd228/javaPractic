public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        System.out.println("Creating new TextDocument.");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Opening existing TextDocument.");
        return new TextDocument();
    }
}
