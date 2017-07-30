package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass153 {

    @Ignore    private SampleClass154 sampleClass;

    public SampleClass153(){
        sampleClass = new SampleClass154();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}