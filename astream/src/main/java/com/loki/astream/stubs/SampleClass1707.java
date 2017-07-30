package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1707 {

    @Ignore    private SampleClass1708 sampleClass;

    public SampleClass1707(){
        sampleClass = new SampleClass1708();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}