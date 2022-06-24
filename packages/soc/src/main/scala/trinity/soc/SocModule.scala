package trinity.soc

import chisel3._
import chisel3.util._

import trinity.soc.cpu.CpuCore
import trinity.soc.gpu.GpuCore

class SocModule extends Module {
  val cpu = new CpuCore()
  val gpu = new GpuCore()
}