package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass993 {

    @Ignore    private SampleClass994 sampleClass;

    public SampleClass993(){
        sampleClass = new SampleClass994();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}