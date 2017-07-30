package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass89 {

    @Ignore    private SampleClass90 sampleClass;

    public SampleClass89(){
        sampleClass = new SampleClass90();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}