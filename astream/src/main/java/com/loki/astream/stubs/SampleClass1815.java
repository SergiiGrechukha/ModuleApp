package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1815 {

    @Ignore    private SampleClass1816 sampleClass;

    public SampleClass1815(){
        sampleClass = new SampleClass1816();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}