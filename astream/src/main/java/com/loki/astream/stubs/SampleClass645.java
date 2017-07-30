package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass645 {

    @Ignore    private SampleClass646 sampleClass;

    public SampleClass645(){
        sampleClass = new SampleClass646();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}