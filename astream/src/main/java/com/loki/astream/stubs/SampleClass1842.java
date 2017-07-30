package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1842 {

    @Ignore    private SampleClass1843 sampleClass;

    public SampleClass1842(){
        sampleClass = new SampleClass1843();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}