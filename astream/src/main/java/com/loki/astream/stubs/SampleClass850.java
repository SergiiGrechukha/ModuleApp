package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass850 {

    @Ignore    private SampleClass851 sampleClass;

    public SampleClass850(){
        sampleClass = new SampleClass851();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}