package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1753 {

    @Ignore    private SampleClass1754 sampleClass;

    public SampleClass1753(){
        sampleClass = new SampleClass1754();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}