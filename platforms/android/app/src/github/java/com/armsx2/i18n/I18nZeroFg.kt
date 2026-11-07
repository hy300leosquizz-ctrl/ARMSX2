package com.armsx2.i18n

/**
 * ZeroFG strings, github flavour only.
 *
 * The play source set has an empty map of the same name, so these are absent from the Play build
 * rather than present-but-unreachable. [EN] merges whichever one is in scope.
 */
internal val ZEROFG_EN: Map<String, String> = mapOf(
    "perf.zerofg.label" to "Frame Generation (ZeroFG)",
    "perf.zerofg.description" to "Mobile-native frame generation engine, optimized end to end for performance and image quality at 2X rate. Vulkan 1.3 required. Hot-swappable.",
    "perf.zerofg.mode.label" to "ZeroFG mode",
    "perf.zerofg.mode.description" to "Zero: highest quality. ReallyZero: high quality, lowest cost. ZeroGS / ReallyZeroGS: GS-aware modes, exclusive to ARMSX2, for higher quality. Experimental.",
)
