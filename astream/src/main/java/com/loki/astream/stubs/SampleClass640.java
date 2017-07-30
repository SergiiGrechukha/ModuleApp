package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass640 {

    @Ignore    private SampleClass641 sampleClass;

    public SampleClass640(){
        sampleClass = new SampleClass641();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}