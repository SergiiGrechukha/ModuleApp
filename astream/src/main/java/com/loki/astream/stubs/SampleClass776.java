package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass776 {

    @Ignore    private SampleClass777 sampleClass;

    public SampleClass776(){
        sampleClass = new SampleClass777();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}