package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass656 {

    @Ignore    private SampleClass657 sampleClass;

    public SampleClass656(){
        sampleClass = new SampleClass657();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}