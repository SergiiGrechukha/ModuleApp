package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1782 {

    @Ignore    private SampleClass1783 sampleClass;

    public SampleClass1782(){
        sampleClass = new SampleClass1783();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}