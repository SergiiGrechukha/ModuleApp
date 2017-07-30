package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass79 {

    @Ignore    private SampleClass80 sampleClass;

    public SampleClass79(){
        sampleClass = new SampleClass80();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}