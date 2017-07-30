package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass88 {

    @Ignore    private SampleClass89 sampleClass;

    public SampleClass88(){
        sampleClass = new SampleClass89();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}