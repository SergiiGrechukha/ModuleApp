package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1792 {

    @Ignore    private SampleClass1793 sampleClass;

    public SampleClass1792(){
        sampleClass = new SampleClass1793();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}