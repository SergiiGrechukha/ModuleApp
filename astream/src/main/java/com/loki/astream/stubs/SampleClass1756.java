package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1756 {

    @Ignore    private SampleClass1757 sampleClass;

    public SampleClass1756(){
        sampleClass = new SampleClass1757();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}