package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass152 {

    @Ignore    private SampleClass153 sampleClass;

    public SampleClass152(){
        sampleClass = new SampleClass153();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}