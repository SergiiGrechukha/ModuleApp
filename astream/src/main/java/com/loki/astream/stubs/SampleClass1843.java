package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1843 {

    @Ignore    private SampleClass1844 sampleClass;

    public SampleClass1843(){
        sampleClass = new SampleClass1844();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}