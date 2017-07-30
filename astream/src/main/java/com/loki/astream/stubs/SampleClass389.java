package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass389 {

    @Ignore    private SampleClass390 sampleClass;

    public SampleClass389(){
        sampleClass = new SampleClass390();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}