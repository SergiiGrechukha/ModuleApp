package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass644 {

    @Ignore    private SampleClass645 sampleClass;

    public SampleClass644(){
        sampleClass = new SampleClass645();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}