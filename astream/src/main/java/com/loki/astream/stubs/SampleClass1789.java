package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1789 {

    @Ignore    private SampleClass1790 sampleClass;

    public SampleClass1789(){
        sampleClass = new SampleClass1790();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}