package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1769 {

    @Ignore    private SampleClass1770 sampleClass;

    public SampleClass1769(){
        sampleClass = new SampleClass1770();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}