package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1708 {

    @Ignore    private SampleClass1709 sampleClass;

    public SampleClass1708(){
        sampleClass = new SampleClass1709();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}