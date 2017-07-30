package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1822 {

    @Ignore    private SampleClass1823 sampleClass;

    public SampleClass1822(){
        sampleClass = new SampleClass1823();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}