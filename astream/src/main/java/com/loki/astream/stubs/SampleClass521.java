package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass521 {

    @Ignore    private SampleClass522 sampleClass;

    public SampleClass521(){
        sampleClass = new SampleClass522();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}