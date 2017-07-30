package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1797 {

    @Ignore    private SampleClass1798 sampleClass;

    public SampleClass1797(){
        sampleClass = new SampleClass1798();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}