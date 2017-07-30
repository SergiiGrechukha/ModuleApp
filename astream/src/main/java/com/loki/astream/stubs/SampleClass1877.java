package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1877 {

    @Ignore    private SampleClass1878 sampleClass;

    public SampleClass1877(){
        sampleClass = new SampleClass1878();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}