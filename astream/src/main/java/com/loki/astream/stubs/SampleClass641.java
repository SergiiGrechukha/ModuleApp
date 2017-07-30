package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass641 {

    @Ignore    private SampleClass642 sampleClass;

    public SampleClass641(){
        sampleClass = new SampleClass642();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}