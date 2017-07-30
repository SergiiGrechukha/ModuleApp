package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass14 {

    @Ignore    private SampleClass15 sampleClass;

    public SampleClass14(){
        sampleClass = new SampleClass15();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}