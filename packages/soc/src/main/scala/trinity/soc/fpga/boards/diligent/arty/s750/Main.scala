package trinity.soc.fpga.boards.diligent.arty.s750

import chisel3.stage.{ChiselStage, ChiselGeneratorAnnotation}
import trinity.soc.SocModule

object Main extends App {
  val stage = new chisel3.stage.ChiselStage()
  stage.execute(Array("-X", "verilog"), ChiselGeneratorAnnotation(() => new SocModule()))
}