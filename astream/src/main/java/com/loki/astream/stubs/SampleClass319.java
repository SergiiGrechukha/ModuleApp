package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass319 {

    @Ignore    private SampleClass320 sampleClass;

    public SampleClass319(){
        sampleClass = new SampleClass320();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}