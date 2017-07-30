package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass76 {

    @Ignore    private SampleClass77 sampleClass;

    public SampleClass76(){
        sampleClass = new SampleClass77();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}