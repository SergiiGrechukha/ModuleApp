package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1794 {

    @Ignore    private SampleClass1795 sampleClass;

    public SampleClass1794(){
        sampleClass = new SampleClass1795();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}