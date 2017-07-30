package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass106 {

    @Ignore    private SampleClass107 sampleClass;

    public SampleClass106(){
        sampleClass = new SampleClass107();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}