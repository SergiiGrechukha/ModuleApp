package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass297 {

    @Ignore    private SampleClass298 sampleClass;

    public SampleClass297(){
        sampleClass = new SampleClass298();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}