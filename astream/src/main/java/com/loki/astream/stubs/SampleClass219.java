package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass219 {

    @Ignore    private SampleClass220 sampleClass;

    public SampleClass219(){
        sampleClass = new SampleClass220();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}