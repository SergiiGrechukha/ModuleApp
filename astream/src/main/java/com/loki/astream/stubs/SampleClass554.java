package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass554 {

    @Ignore    private SampleClass555 sampleClass;

    public SampleClass554(){
        sampleClass = new SampleClass555();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}