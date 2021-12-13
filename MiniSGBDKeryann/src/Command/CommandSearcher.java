package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandSearcher {
	public static Command NewCommand(String cmd) {
		ArrayList<String> args = new ArrayList<String>(List.of(cmd.toUpperCase().split(" ")));
		switch (args.get(0)) {
		case "CREATE":
			args.remove(0);
			switch (args.get(0)) {
			case "RELATION":
				args.remove(0);
				return new CreateRelationCommand(args);
			default:
				// code block
			}
			break;
		case "INSERT":
			// code block
			return new InsertCommand(args);
		case "BATCHINSERT":
			// code block
			return new BatchInsertCommand(args);
		case "SELECTMONO":
			// code block
			return new SelectMonoCommand(args);
		case "DELETE":
			// code block
			return new BatchInsertCommand(args);
		case "DROPBD":
			// code block
			return new DropdbCommand();
		default:
			// code block
		}

		return new DefaultCommand();
	}

}
