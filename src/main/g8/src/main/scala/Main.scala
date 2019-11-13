import ru.kvb74.semod.Report
import ru.kvb74.semod.opengroup.archimate.motivation.{Goal, Stakeholder}
import ru.kvb74.semod.plantuml.PlantUml

object Main extends App {

	lazy val stakeholder = Stakeholder("Some")
		.rel.associatedWith(goal)
	lazy val goal = Goal("Use SEMod!")

	val report = Report.withDependencies(stakeholder)
	// save diagram as PNG file
	PlantUml.render(
		PlantUml.opt
			.file("./$name$.png")
			.name("$name$")
			.title("$name$ semod report")
			// remove .terms row to use default opengroup terminology resource file
  		.terms("custom")
			.get,
		report
	)
	// save diagram as SVG file
	PlantUml.render(
		PlantUml.opt
			.file("./$name$.svg")
			.name("$name$")
			.title("$name$ semod report")
			// remove .terms row to use default opengroup terminology resource file
			.terms("custom")
			.get,
		report
	)
	// save diagram as puml source file
	PlantUml.render(
		PlantUml.opt
			.file("./$name$.puml")
			.name("$name$")
			.title("$name$ semod report")
			// remove .terms row to use default opengroup terminology resource file
			.terms("custom")
			.get,
		report
	)
	// return puml sources as string
	val rep = PlantUml.render(
		PlantUml.opt
			.name("$name$")
			.title("$name$ semod report")
			// remove .terms row to use default opengroup terminology resource file
			.terms("custom")
			.get,
		report
	)
	print(rep)

}
