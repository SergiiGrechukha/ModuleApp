package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass64 {

    @Ignore    private SampleClass65 sampleClass;

    public SampleClass64(){
        sampleClass = new SampleClass65();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}