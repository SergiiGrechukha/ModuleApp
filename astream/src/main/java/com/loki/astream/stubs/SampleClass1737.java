package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1737 {

    @Ignore    private SampleClass1738 sampleClass;

    public SampleClass1737(){
        sampleClass = new SampleClass1738();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}