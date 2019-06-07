import ru.kvb74.semod.opengroup.archimate.Report
import ru.kvb74.semod.opengroup.archimate.motivation.{Goal, Stakeholder}

object Main extends App {

	lazy val stakeholder = Stakeholder("Some")
		.rel.associatedWith(goal)
	lazy val goal = Goal("Use SEMod!")

	print(Report.withDependencies(
		Report.Options.empty
			.name("$name$")
			.title("$name$ semod report")
			.get,
		stakeholder
	))
}
