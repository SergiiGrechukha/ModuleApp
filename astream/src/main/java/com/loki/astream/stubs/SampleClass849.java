package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass849 {

    @Ignore    private SampleClass850 sampleClass;

    public SampleClass849(){
        sampleClass = new SampleClass850();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}