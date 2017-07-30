package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1628 {

    @Ignore    private SampleClass1629 sampleClass;

    public SampleClass1628(){
        sampleClass = new SampleClass1629();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}