package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1674 {

    @Ignore    private SampleClass1675 sampleClass;

    public SampleClass1674(){
        sampleClass = new SampleClass1675();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}