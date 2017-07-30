package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1878 {

    @Ignore    private SampleClass1879 sampleClass;

    public SampleClass1878(){
        sampleClass = new SampleClass1879();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}