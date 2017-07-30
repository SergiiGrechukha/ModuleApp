package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass490 {

    @Ignore    private SampleClass491 sampleClass;

    public SampleClass490(){
        sampleClass = new SampleClass491();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}